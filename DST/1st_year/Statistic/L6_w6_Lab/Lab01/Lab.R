# Naythira Chokvittaya: ID 6887003
# Tanuphat Sojindamanee : ID 6887020

2 + 3         # Addition
10 - 4        # Subtraction
5 * 6         # Multiplication
10 / 2        # Division
2 ^ 3           # Exponentiation

log(10)       # Natural logarithm (base e)

log10(10)     # Logarithm base 10

sqrt(16)      # Square root

#Trigonometric functions

sin(pi/2)     # Sine of π/2 radians

cos(pi)       # Cosine of π radians

tan(pi/4)     # Tangent of π/4 radians

#Working with Vectors  
#Vectors store collections of elements of the same type.

# Create vectors
vec0 <- vector(mode = "numeric", length = 10) # Create a vector filled with 0
vec0

vec1 <- c(1:10, 15, 20)                      # Create a vector with specified values
vec1

length(vec1) 

mean(vec1) 

summary(vec1)


# Create and manipulate matrices
mat <- matrix(nrow = 3, ncol = 4) # Create an empty matrix
mat
mat[2, 4] <- 8                   # Assign value to a specific element
mat[1, ] <- c(1:4)               # Assign values to the first row
mat[, 3] <- c(5:7)               # Assign values to the third column
mat[2, 1:2] <- c(5, 6)           # Assign values to specific elements
mat[3, c(1:2, 4)] <- c(9, 10, 11) # Assign multiple values
mat

nrow(mat) 
ncol(mat)
summary(mat)
#Add row and column names

rownames(mat) <- c("student1", "student2", "student3")
mat
colnames(mat) <- c("test1", "test2", "test3", "test4")
mat
#Arrays can store multi-dimensional data.

# Create and manipulate arrays
arr <- array(dim = c(2, 3, 4))  # Create a 3D array
arr
arr[1, 3, 2] <- 5              # Assign value to a specific element
arr
#Load data from external files and perform basic data exploration.  
#! MAKE SURE THAT THE FILE LOCATION IS SAME WITH DIRECTORY.  

# Import data
envi <- read.csv("environment.csv", header = TRUE) # Reads a CSV file into a data frame

# Explore data
str(envi)             # View the structure of the data
head(envi, 10)        # View the first 10 rows
mean(envi$rainfall.m) # Calculate the mean of a column
is.na(envi$rainfall.m) # Check for missing values
which(is.na(envi$rainfall.m)) # Find indices of missing values
mean(envi$rainfall.m, na.rm = TRUE) # Mean excluding missing values
# Handle missing data
envi$rainfall.m[is.na(envi$rainfall.m)] <- 0
envi
# Work with character columns
is.character(envi$site)
envi$site <- as.character(envi$site)
envi$site[1] <- "Site.A"
envi$site[2:10] <- paste0("Site.", letters[2:10])
envi
 
#Use the dplyr package for data manipulation.

# Load dplyr
library(dplyr)
# Explore and select data
glimpse(envi)
select(envi, altitude.m)    # Select specific columns
select(envi, -altitude.m)   # Exclude specific columns
# Filter rows
slice(envi, 2)         
slice(envi, 2:10)       
filter(envi, temperature.C > 18) # Filter rows based on condition
filter(envi, temperature.C > 18 | temperature.C > 20) # Apply logical OR
# Add and arrange data
optimal_temp <- filter(envi, temperature.C > 18 | temperature.C > 20)
optimal_temp_log <- mutate(envi, logTemp = log(temperature.C))
arrange(optimal_temp_log, temperature.C)               
arrange(optimal_temp_log, desc(logTemp))
 
#The %>% operator simplifies chaining multiple data manipulation steps.

# Without pipe
filtered_data <- filter(optimal_temp_log, altitude.m > 100)
filtered_data
arranged_data <- arrange(filtered_data, desc(altitude.m))
arranged_data
# With pipe
arranged_data_1 <- optimal_temp_log %>%
  filter(altitude.m > 100) %>%
  arrange(desc(altitude.m))
arranged_data_1

