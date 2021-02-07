package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {


	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51wkgbSYStL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2S5E9CXI7UPJ2&dchild=1&keywords=redimi+note+8&qid=1612580549&sprefix=redim%2Caps%2C294&sr=8-1");
		pedido.setDescricao("Smartphone Xiaomi Redmi note 8 64GB 4GB RAM Preto Versão Global");
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
