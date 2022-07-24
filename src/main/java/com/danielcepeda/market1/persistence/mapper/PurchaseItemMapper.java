package com.danielcepeda.market1.persistence.mapper;

import com.danielcepeda.market1.domain.PurchaseItem;
import com.danielcepeda.market1.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

// como se esta referencia al Product le temos q decir q lo vamos a usar ya q internamente
// esta haciendo el mapeo de product
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProducto toComprasProducto(PurchaseItem item);
}
