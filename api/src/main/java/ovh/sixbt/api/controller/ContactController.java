package ovh.sixbt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.business.IContactService;
import ovh.sixbt.business.core.Contact;

import java.util.List;

@RestController
public class ContactController {
    private final IContactService contactService;

    @Autowired
    public ContactController(IContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("${api-context-path}/contacts/public")
    @ResponseBody
    public List<Contact> getPublicContacts() {
        return contactService.getPublicContacts();
    }

    @GetMapping("${api-context-path}/contacts/private")
    @ResponseBody
    public List<Contact> getPrivateContacts() {
        return contactService.getPrivateContacts();
    }
}
