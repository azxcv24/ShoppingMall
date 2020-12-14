package ci.jvision.admin201718054.web;

import ci.jvision.admin201718054.service.ProductsService;
import ci.jvision.admin201718054.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;
    @PostMapping("/api/v1/products")
    public Long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return productsService.save(requestDto);
    }
}
