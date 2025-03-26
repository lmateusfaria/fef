package br.com.fef.loja.domains.dtos;

import br.com.fef.loja.domains.Cliente;
import br.com.fef.loja.domains.Pedido;
import br.com.fef.loja.domains.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

public class PedidoDTO {
    private Long id;

    @NotNull(message = "O cliente é obrigatório")
    private Cliente clienteId;

    private Status status;

    public PedidoDTO() {
    }

    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.clienteId = pedido.getCliente();
        this.status = pedido.getStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
