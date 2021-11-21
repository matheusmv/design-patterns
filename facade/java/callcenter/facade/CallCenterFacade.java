package facade.java.callcenter.facade;

import facade.java.callcenter.model.Card;
import facade.java.callcenter.service.CardService;
import facade.java.callcenter.service.PaymentService;
import facade.java.callcenter.service.RegisterService;
import facade.java.callcenter.service.ReportService;

public class CallCenterFacade {

    private CardService cardService;
    private RegisterService registerService;
    private ReportService reportService;
    private PaymentService paymentService;

    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
    }

    public Long getCardByUser(Long l) {
        Card card = cardService.getCardByUser(l);
        return card.getCardNumber();
    }

    public void getSumary(Long cardNumber) {
        reportService.getSumary(new Card(null, cardNumber));
    }

    public void getPaymentInfoByCard(Long cardNumber) {
        paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
    }
}
