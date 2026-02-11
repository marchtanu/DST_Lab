# Naythira Chokvittaya: ID 6887003
# Tanuphat Sojindamanee : ID 6887020
library(dplyr)

compensation <- read.csv('compensation.csv')

glimpse(compensation)

compensation <- compensation %>%
  mutate(Root = ifelse(is.na(Root), 0, Root))
compensation

mean_root <- mean(compensation$Root)
mean_root

lo_hi_fruit <- compensation %>%
  filter(Fruit > 80 | Fruit < 20)
lo_hi_fruit

compensation_trans <- compensation %>%
  mutate(sqrt_fruit = sqrt(Fruit))

head(compensation_trans, 15)

compensation_trans %>%
  arrange(desc(sqrt_fruit))
compensation_trans


result_pipe <- compensation %>%
  filter(Fruit > 50) %>%
  arrange(Fruit)
result_pipe

result_no_pipe <- arrange(filter(compensation, Fruit > 50), Fruit)
result_no_pipe

