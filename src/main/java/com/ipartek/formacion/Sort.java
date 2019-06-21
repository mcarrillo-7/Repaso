package com.ipartek.formacion;

public class Sort {
	public static int[] bubbleShort(int[] aDesorden) throws Exception {

		if (aDesorden == null) {
			throw new Exception("Nu puede ser null");

		}

		int[] result = new int[aDesorden.length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 1; j < result.length; j++) {
				if (aDesorden[j - 1] > aDesorden[j]) {
					int aux = aDesorden[j - 1];
					aDesorden[j - 1] = aDesorden[j];
					aDesorden[j] = aux;
				}
			}
		}
		return result;
	}
}
