package ovh.sixbt.api.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ovh.sixbt.domain.models.contacts.Contact;
import ovh.sixbt.domain.ports.in.IContactService;

import java.util.List;

@Tag(description = "Useful contacts.", name = "Contacts")
@RestController
public class ContactController {
    private final IContactService contactService;

    @Autowired
    public ContactController(IContactService contactService) {
        this.contactService = contactService;
    }

    @Operation(description = "Get the contact list.")
    @GetMapping("${api-context-path}/contacts")
    @ResponseBody
    public ResponseEntity<List<Contact>> getPublicContacts() {
        List<Contact> publicContacts = contactService.getPublicContacts();
        return ResponseEntity.ok(publicContacts);
    }

    @Operation(description = "Get the private contact list.")
    @GetMapping("${api-context-path}/contacts/private")
    @ResponseBody
    public ResponseEntity<List<Contact>> getPrivateContacts() {
        List<Contact> privateContacts = contactService.getPrivateContacts();
        return ResponseEntity.ok(privateContacts);
    }
}
