package dev.mateustpas.Freezer.repository;

import dev.mateustpas.Freezer.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
