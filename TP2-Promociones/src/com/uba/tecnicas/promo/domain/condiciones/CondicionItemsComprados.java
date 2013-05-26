package com.uba.tecnicas.promo.domain.condiciones;

import java.util.List;

import com.uba.tecnicas.promo.domain.CondicionOferta;
import com.uba.tecnicas.promo.domain.Item;
import com.uba.tecnicas.promo.domain.Venta;

public class CondicionItemsComprados implements CondicionOferta {

	@Override
	public List<Item> getAplicantes(Venta venta) {
		return venta.getItems();
	}
}