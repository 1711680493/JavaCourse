public class Test {
	
	public static void main(String[] args) {
		// 四维数组,包含两个三维数组.
		int[][][][] arr = {
			{
				{
					{1,2,3},
					{4,5,6},
					{7,8}
				},
				{
					{8,7},
					{6,5,4},
					{3,2,1}
				}
			},
			{
				{
					{100,100,99},
					{101,98,99},
					{97,98}
				},
				{
					{105,55},
					{90,120,71},
					{94,94,82}
				}
			}
		};
		for (int t = 0;t < arr.length;t++) {
			for (int z = 0;z < arr[t].length;z++) {
				// 这里的条件是三维数组里的二维数组
				for (int y = 0;y < arr[t][z].length;y++) {
					// 这里的条件是三维数组里的二维数组里的一维数组
					for (int x = 0;x < arr[t][z][y].length;x++) {
						// 直接从三维数组中获取对应二维数组的一维数组的值
						System.out.println(arr[t][z][y][x]);
					}
				}
			}
		}
	}
	
}