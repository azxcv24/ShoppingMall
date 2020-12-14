package ci.jvision.admin201718054.service;


import ci.jvision.admin201718054.domain.Products.Products;
import ci.jvision.admin201718054.domain.Products.ProductsRepository;
import ci.jvision.admin201718054.web.dto.ProductsListResponseDto;
import ci.jvision.admin201718054.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {


    @Transactional
    public Long save(ProductsSaveRequestDto requestDto){
        return ProductsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public List<ProductsListResponseDto> findAllDesc()
    {
        return ProductsRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
