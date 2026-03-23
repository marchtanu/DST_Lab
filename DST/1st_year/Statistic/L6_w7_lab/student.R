# Naythira Chokvittaya: ID 6887003
# Tanuphat Sojindamanee : ID 6887020
setwd()
getwd()

comp <- read.csv("student_performance.csv")
head(comp)
str(comp)
library(dplyr)
#install.packages("dplyr")
library(ggplot2)
#install.packages("ggplot2")
library(gridExtra)
#install.packages("gridExtra")

boxplot(comp$score, main = "Students (Check Outliers)")
#ans: มีouliersอยู่ด้านบน
ggplot(comp, aes(y = score)) +
  geom_boxplot(fill = "lightblue") +
  theme_minimal()


# 2) IQR method for outlier detection
# Compute Q1, Q3, IQR and define lower/upper bounds

Q1 <- quantile(comp$score, 0.25, na.rm = TRUE)
Q3 <- quantile(comp$score, 0.75, na.rm = TRUE)
IQR_val <- IQR(comp$score, na.rm = TRUE)

lower <- Q1 - 1.5 * IQR_val
upper <- Q3 + 1.5 * IQR_val

lower
upper

# 3) Identify outliers (IQR rule)
# Count and display rows outside the bounds

#4.3
out_iqr <- comp$score < lower | comp$score > upper
sum(out_iqr, na.rm = TRUE)

#4.4
# show the outlier rows
comp[out_iqr, ]
#ans 300 outliers

# 4) Method A: Remove outliers
# Keep only data within IQR bounds

# Method A: remove outliers base R
comp_no_out <- comp[!out_iqr, ]
nrow(comp); nrow(comp_no_out)

#5
# Method A: remove outliers dplyr
comp_clean <- comp %>% filter(score >= lower & score <= upper)

# Method B: winsorize/cap
#Cap extreme values to lower/upper bounds

#comp_cap <- comp
#comp_cap$score <- pmin(pmax(comp_cap$score, lower), upper)
#nrow(comp_cap)

# 3) Detect outliers using Z-score method

z <- as.vector(scale(comp$score))
outlier_z <- abs(z) > 3
table(outlier_z)

comp_clean_z <- comp[!outlier_z, ]
nrow(comp_clean_z)

# 4) Compare before vs after cleaning
# Visual comparison using boxplots

# graph by base R
par(mfrow = c(1,2))
boxplot(comp$score, main = "Before cleaning")
boxplot(comp_clean_z$score, main = "After (IQR removed)")

par(mfrow = c(1,1))

# graph by ggplots
p1 <- ggplot(comp, aes(y = score)) +
  geom_boxplot(fill = "salmon") +
  labs(title = "Before cleaning") +
  theme_minimal()

p2 <- ggplot(comp_clean_z, aes(y = score)) +
  geom_boxplot(fill = "lightgreen") +
  labs(title = "After removing outliers") +
  theme_minimal()

grid.arrange(p1, p2, ncol = 2)

# 5) Distribution plots: Histogram & Density (Before vs After)

#