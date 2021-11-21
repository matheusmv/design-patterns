package facade.java.callcenter.facade;

import java.util.List;

import facade.java.callcenter.model.Card;
import facade.java.callcenter.model.Register;
import facade.java.callcenter.service.CardService;
import facade.java.callcenter.service.RegisterService;
import facade.java.callcenter.service.ReportService;
import facade.java.callcenter.service.SecurityService;

public class CallCenterNewCardFacade {

    private CardService cardService;
    private RegisterService registerService;
    private ReportService reportService;
    private SecurityService securityService;

    public CallCenterNewCardFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public void cancelLastRegister(Long user) {
        Card card = cardService.getCardByUser(user);
        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }

    public void orderNewCard(Long user) {
        Card card = cardService.getCardByUser(user);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 99887766L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }
}
