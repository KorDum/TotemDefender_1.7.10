package ru.kordum.totemDefender.entity;

import ru.kordum.totemDefender.block.BlockTotem;

public class TileEntityIronTotem extends TileEntityTotem {
    public void init() {
        type = BlockTotem.EnumType.IRON;
    }
}
