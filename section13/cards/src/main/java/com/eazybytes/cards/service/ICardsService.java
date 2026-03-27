package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;
import org.springframework.stereotype.Service;


public interface ICardsService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return Card Details based on a given mobileNumber
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @param cardsDto -
     * @return boolean indicating if the update of Card Details has been successful or not
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if delete of Card Details is successful or not
     */
    boolean deleteCard(String mobileNumber);

}
