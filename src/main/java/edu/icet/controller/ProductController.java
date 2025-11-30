package edu.icet.controller;

import edu.icet.model.Dto.ProductDto;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    final ProductService productService;

    @PostMapping("addProduct")
    public String addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
}
