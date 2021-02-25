package com.matt.cocktail.domain;

public enum DrinkType {

    Alcoholic {
        @Override
        public String toString() {
            return "Alcoholic";
        }
    },
    NonAlcoholic {
        @Override
        public String toString() {
            return "Non-Alcoholic";
        }
    }, Both {
        @Override
        public String toString() {
            return "Both";
        }
    }

}
