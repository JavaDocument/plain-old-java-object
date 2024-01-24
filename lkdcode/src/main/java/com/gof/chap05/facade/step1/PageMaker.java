package com.gof.chap05.facade.step1;

class PageMaker {
    private PageMaker() {
    }

    public static void makeHTMLPage(String msg) {
        final String file = DataBase.read("I'm file");
        final HTMLWriter htmlWriter = new HTMLWriter();

        htmlWriter.title(file + "  " + msg);
        htmlWriter.paragraph(file + "  " + msg);
        htmlWriter.link(file + "  " + msg);
        htmlWriter.mailto(file + "  " + msg);
        htmlWriter.close();
    }
}
