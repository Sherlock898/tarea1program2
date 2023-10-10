CC = g++
CFLAGS = -O3 -Wall -shared  -fPIC

test: 
	$(CC) $(CFLAGS) $(python3 -m pybind11 --includes) src/main.cpp -o example$(python3-config --extension-suffix) -I/usr/include/python3.10 -Isdsl-lite/include
sdslTest: 
	$(CC) $(CFLAGS) src/main.cpp -o test.out -Isdsl-lite/build/include -Lsdsl-lite/build/libsdsl