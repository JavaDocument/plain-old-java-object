package com.gof.structual.facade;

class 기덕이네 {

    private 재료손질하는기덕 재료손질하는기덕;
    private 요리하는기덕 요리하는기덕;
    private 설거지하는기덕 설거지하는기덕;

    public 기덕이네() {
        this.재료손질하는기덕 = new 재료손질하는기덕();
        this.요리하는기덕 = new 요리하는기덕();
        this.설거지하는기덕 = new 설거지하는기덕();
    }

    public void 밥해줘() {
        재료손질하는기덕.trim();
        요리하는기덕.cook();
        설거지하는기덕.washDishes();
    }
}
