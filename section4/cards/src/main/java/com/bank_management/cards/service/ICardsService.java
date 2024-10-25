package com.bank_management.cards.service;

import com.bank_management.cards.dto.CardsDto;

public interface ICardsService {
    void createCard(String mobileNumber);


    CardsDto fetchCard(String mobileNumber);


    boolean updateCard(CardsDto cardsDto);


    boolean deleteCard(String mobileNumber);
}
