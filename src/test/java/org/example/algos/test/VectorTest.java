package org.example.algos.test;

import org.example.algos.dtos.VectorNew;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VectorTest {
    private VectorNew vector;

    @BeforeEach
    void init() {
        this.vector = new VectorNew(1.3, 2.1, 4.23);
    }

    @Test
    @DisplayName("Конструктор")
    void testVectorConstructor() {
        Assertions.assertEquals(1.3, vector.getX());
        Assertions.assertEquals(2.1, vector.getY());
        Assertions.assertEquals(4.23, vector.getZ());
    }

    @Test
    @DisplayName("Длина(модуль)")
    void testVectorLength() {
        Assertions.assertEquals(4.898254791249635, this.vector.length());
    }

    @Test
    @DisplayName("Скалярное произведение")
    void testVectorScalarProduct() {
        VectorNew vectorNew = new VectorNew(2,2,2);
        Assertions.assertEquals(15.26,
                (double) Math.round(this.vector.scalarProduct(vectorNew) * 100 )/ 100);
    }

    @Test
    @DisplayName("Векторное произведение")
    void testVectorCrossProduct() {
        VectorNew vectorNew = new VectorNew(2, 2, 2);
        VectorNew crossVector = this.vector.crossProduct(vectorNew);
        Assertions.assertEquals(-4.26, (double) Math.round(crossVector.getX() * 100) / 100);
        Assertions.assertEquals(5.86, (double) Math.round(crossVector.getY() * 100) / 100);
        Assertions.assertEquals(-1.6, crossVector.getZ());
    }
}
