package com.dr4kk0nnys.project.controllers;

import java.util.HashMap;
import java.util.Map;

import com.dr4kk0nnys.project.models.Contract;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    private Map<String, Contract> contracts = new HashMap<>();

    @GetMapping("contracts/get-contract")
    public Contract getContract(@RequestParam String id) {
        return this.contracts.get(id);
    }

    @PostMapping("contracts/create-contract")
    public Contract createContract(@RequestBody Contract contract) {
        Contract newContract = new Contract(contract);
        System.out.println("New contract created: " + newContract.getId());
        this.contracts.put(contract.getId(), contract);

        return newContract;
    }

    @DeleteMapping("contracts/delete-contract")
    public Contract deleteContract(@RequestParam String id) {
        return this.contracts.remove(id);
    }
}
