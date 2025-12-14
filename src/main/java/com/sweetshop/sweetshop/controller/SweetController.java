package com.sweetshop.sweetshop.controller;

import com.sweetshop.sweetshop.model.Sweet;
import com.sweetshop.sweetshop.repository.SweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/api/sweets")
@CrossOrigin
public class SweetController {

    @Autowired
    private SweetRepository repo;

    @PostMapping
    public Sweet add(@RequestBody Sweet sweet) {
        return repo.save(sweet);
    }

    @GetMapping
    public List<Sweet> all() {
        return repo.findAll();
    }

    @PostMapping("/{id}/purchase")
    public Sweet purchase(@PathVariable Long id) {
        Sweet sweet = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Sweet not found"));

        if (sweet.getQuantity() <= 0) {
            throw new RuntimeException("Out of stock");
        }

        sweet.setQuantity(sweet.getQuantity() - 1);

        return repo.save(sweet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Sweet not found");
        }

        repo.deleteById(id);
    }
}
