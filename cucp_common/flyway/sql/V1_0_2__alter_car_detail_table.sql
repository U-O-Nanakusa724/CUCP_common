-- -----------------------------------------------------
-- Alter Table `cucp`.`car_details`
-- -----------------------------------------------------
ALTER TABLE `cucp`.`car_details`
CHANGE COLUMN `model_year` `model_year` DATE NULL DEFAULT NULL COMMENT '年式' ,
DROP FOREIGN KEY `fk_car_details_cars1`,
DROP COLUMN `car_id`,
DROP INDEX `fk_car_details_cars1_idx`,
ADD COLUMN `grade_id` INT UNSIGNED NOT NULL AFTER `id`,
ADD INDEX `fk_car_details_grades1_idx` (`grade_id` ASC),
ADD CONSTRAINT `fk_car_details_grades1`
FOREIGN KEY (`grade_id`) REFERENCES `cucp`.`grades` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;