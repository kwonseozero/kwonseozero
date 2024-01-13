package com.kh.spring03.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
    Random r = new Random();

    // 주사위
    @RequestMapping("/dice")
    public int dice() {
        int dice = r.nextInt(6) + 1;
        return dice;
    }

    // 로또
    @RequestMapping("/lotto")
    public ArrayList<Integer> lotto() {
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        while (lottoNumbers.size() < 6) {
            int number = r.nextInt(45) + 1;
            if (!lottoNumbers.contains(number)) {
                lottoNumbers.add(number);
            }
        }
        return lottoNumbers;
    }

    // 음식
    @RequestMapping("/food")
    public String food() {
        String[] food = new String[] {"치킨", "떡볶이", "두부조림", "마라탕", "삼겹살", "막창", "김치찜", "파스타", "고구마맛탕"};
        int pick = r.nextInt(food.length);

        return food[pick];
    }
}
