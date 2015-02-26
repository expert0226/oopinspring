package staticBlock;

import java.util.Map;

public class Driver06 {
	public static void main(String[] args) {
		System.out.println(MySystem.jvmFreeMemory);
		System.out.println(MySystem.jvmMaxMemory);
		System.out.println(MySystem.jvmTotalMemory);
	}
}

class MySystem {
	final static long jvmFreeMemory;
	final static long jvmMaxMemory = Runtime.getRuntime().maxMemory();
	final static long jvmTotalMemory;
	
	static {
		Runtime runtime = Runtime.getRuntime();
		jvmFreeMemory = runtime.freeMemory(); 
		jvmTotalMemory = runtime.totalMemory();
		
		Map<String, String> map = System.getenv();
		
		System.out.println(map.get("OS"));
		System.out.println(map.get("COMPUTERNAME"));
		System.out.println(map.get("PROCESSOR_IDENTIFIER"));
		
		//System.out.printf("os: %s\r\ncomputer name: %s", map.get("OS"), map.get("COMPUTERNAME"));
	}
}