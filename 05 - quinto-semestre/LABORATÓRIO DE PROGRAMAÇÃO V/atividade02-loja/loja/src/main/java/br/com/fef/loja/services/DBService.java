package br.com.fef.loja.services;

import br.com.fef.loja.domains.*;
import br.com.fef.loja.domains.enums.Status;
import br.com.fef.loja.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private PedidoRepository pedidoRepo;

    public void initDB() {

        Cliente cliente01 = new Cliente(null, "Fulano", "fulano@gmail.com", null);
        Cliente cliente02 = new Cliente(null, "Ciclano", "ciclano@gmail.com", null);
        Cliente cliente03 = new Cliente(null, "Beltrano", "beltrano@gmail.com", null);

        clienteRepo.save(cliente01);
        clienteRepo.save(cliente02);
        clienteRepo.save(cliente03);

        Pedido pedido01 = new Pedido(null,cliente01, Status.ENTREGUE);
        Pedido pedido02 = new Pedido(null,cliente02, Status.PROCESSANDO);
        Pedido pedido03 = new Pedido(null,cliente03, Status.ENVIADO);

        pedidoRepo.save(pedido01);
        pedidoRepo.save(pedido02);
        pedidoRepo.save(pedido03);
    }
}
