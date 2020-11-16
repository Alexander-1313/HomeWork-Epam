package com.epam.ball.service;

import com.epam.ball.entity.Ball;
import com.epam.ball.entity.Bucket;
import com.epam.ball.entity.Color;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallServiceTest {

    Bucket bucket;
    BallService service;
    Ball defaultBall = new Ball(23,Color.GREEN);
    Ball redBall = new Ball(23, Color.RED);

    @BeforeMethod
     public void beforeTest(){
        bucket = new Bucket(15);
        service = new BallService();
    }

    @Test
    public void testKickBallIntoBucket() {
        boolean actual = service.kickBallIntoBucket(bucket, defaultBall);

        assertTrue(actual);
    }

    @Test
    public void testGetBallOutOfBucket() {
        service.kickBallIntoBucket(bucket, defaultBall);

        Ball expected = defaultBall;
        Ball actual = service.getBallOutOfBucket(bucket);

        assertEquals(actual, expected);

    }

    @Test
    public void testGetBallOutOfBucketByColor() {
        service.kickBallIntoBucket(bucket, redBall);

        Ball expected = redBall;
        Ball actual = service.getBallOutOfBucketByColor(bucket, Color.RED);

        assertEquals(actual, expected);
    }

    @Test
    public void testGetBucketWeight() {
        service.kickBallIntoBucket(bucket, defaultBall);

        double expected = defaultBall.getWeight();
        double actual = service.getBucketWeight(bucket);

        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testCountOfBallByColor() {
        service.kickBallIntoBucket(bucket, defaultBall);
        service.kickBallIntoBucket(bucket, redBall);
        service.kickBallIntoBucket(bucket, redBall);

        int expected = 2;
        int actual = service.countOfBallByColor(bucket, Color.RED);

        assertEquals(actual, expected);
    }
}