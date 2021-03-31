-- -----------------------------------------------------
-- Alter Table `cucp`.`cars`
-- -----------------------------------------------------
ALTER TABLE `cucp`.`cars`
DROP COLUMN `code`,
CHANGE COLUMN `name` `name` VARCHAR(64) NOT NULL COMMENT '車種名' ;