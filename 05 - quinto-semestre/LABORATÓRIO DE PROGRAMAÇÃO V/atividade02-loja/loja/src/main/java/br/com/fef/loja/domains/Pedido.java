package br.com.fef.loja.domains;

import br.com.fef.loja.domains.dtos.PedidoDTO;
import br.com.fef.loja.domains.enums.Status;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(generator = "seq_pedidos", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "status")
    private Status status;

    public Pedido() {
    }

    public Pedido(Long pedido) {
    }

    public Pedido(PedidoDTO dto) {
        this.id = dto.getId();
        this.cliente = dto.getClienteId();
        this.status = dto.getStatus();
    }

    public Pedido(Long id, Cliente cliente, Status status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
