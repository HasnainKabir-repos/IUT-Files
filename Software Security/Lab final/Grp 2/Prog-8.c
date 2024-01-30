// Points: 7 pts

int main(int argc, char *argv[]) {
	char *pbuf=malloc(strlen(argv[2])+1);
	char buf[256];

	strcpy(buf, argv[1]); 
	for (; *pbuf++ = *(argv[2]++); );
	exit(1);
}
