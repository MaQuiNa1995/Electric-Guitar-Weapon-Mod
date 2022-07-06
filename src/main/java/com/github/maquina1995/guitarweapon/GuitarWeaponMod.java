package com.github.maquina1995.guitarweapon;

import com.github.maquina1995.guitarweapon.factory.NecesseObjectFactory;

import necesse.engine.modLoader.annotations.ModEntry;

@ModEntry
public class GuitarWeaponMod {

	private NecesseObjectFactory necesseObjectFactory;

	public void init() {

		this.necesseObjectFactory = new NecesseObjectFactory();
	}

	public void postInit() {

	}
}
