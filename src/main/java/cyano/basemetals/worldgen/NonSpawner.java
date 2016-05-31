package cyano.basemetals.worldgen;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class NonSpawner extends WorldGenerator {

	@Override
	public boolean generate(World worldIn, Random prng, BlockPos coord) {
		// do nothing
		return true;
	}
}
