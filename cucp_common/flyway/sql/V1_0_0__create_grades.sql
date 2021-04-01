-- -----------------------------------------------------
-- Create Table `cucp`.`grades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cucp`.`grades` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '管理ID',
  `car_id` INT UNSIGNED NOT NULL,
  `grade` VARCHAR(16) NOT NULL COMMENT 'グレード',
  `created_at` DATE NOT NULL COMMENT '作成日',
  `updated_at` DATE NOT NULL COMMENT '更新日',
  `deleted_at` DATE NULL COMMENT '削除日',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `grade_UNIQUE` (`grade` ASC),
  INDEX `fk_grades_cars1_idx` (`car_id` ASC),
  CONSTRAINT `fk_grades_cars1`
    FOREIGN KEY (`car_id`)
    REFERENCES `cucp`.`cars` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

