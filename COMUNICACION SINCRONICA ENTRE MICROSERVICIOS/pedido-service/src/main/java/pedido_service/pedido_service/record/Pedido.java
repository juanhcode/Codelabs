package pedido_service.pedido_service.record;

import pedido_service.pedido_service.dtos.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}