package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PksdemoappApplication {

	@RequestMapping("/")
	public String hello() {
		String java_ver = System.getProperty("java.vm.version");
		String app_ver = "3";
		String app_index = System.getenv("MY_POD_UID");
		String app_host = System.getenv("MY_POD_IP");
          return "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMTHMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMM        MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMM            MTMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMHMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMM    MNa,.        MYMMMMMM                     MMMMMMMM       MMMMMMMMMM       .MMMMMMMM                MMMMMMM\n"+
                    "MMMMMMMMMMMMMM      TMMM    MMMMMN&,         MMMM                       WMMMMM       MMMMMMM@       .MMMMMM#^                    MMMMM\n"+
                    "MMMMMMMMMMMMMM        MMMMMMMMMMMM: ?5M      MMMM                        UMMMM       MMMMMM^      .JMMMMMM@                      MMMMM\n"+
                    "MMMMMMMMMMMMMM              MMMMMMMMMMMM     MMMM       JMMMMMMMMNx       MMMM       MMMMF       .MMMMMMMM`     .MMMMMMMMMNa    MMMMMM\n"+
                    "MMMMMMBMMMMMMM    MNa,.       MTHMMMMMMN     MMMM       JMMMMMMMMMM]      dMMM       MMM^      .MMMMMMMMMM      .MMMMMMMMMMMMNMMMMMMMM\n"+
                    "MM        ?YMM    MMMMMN&,        MMMMMN     MMMM       JMMMMMMMMMMt      dMMM       MD      .JMMMMMMMMMMM,        ?MMMMMMMMMMMMMMMMMM\n"+
                    "MM            7U..MMMMMM: ?5M     MMMMMN     MMMM       JMMMMMMMMB^      MMMMM              .MMMMMMMMMMMMMN,              _WMMMMMMMMMM\n"+
                    "MM     a,        .TMMMMM:   M     MMMMMN     MMMM                       MMMMMM             ,MMMMMMMMMMMMMMMMa.                .TMMMMMM\n"+
                    "MM     MMMNJ.        (TMa.  M     @WMMMN     MMMM                      MMMMMMM               7MMMMMMMMMMMMMMMMNg,.              .MMMMM\n"+
                    "MM     MMMMMMY5..      MMMNad     FMMMMM     MMMM                    gMMMMMMMM                .WMMMMMMMMMMMMMMMMMMMMNN&.,        ,MMMM\n"+
                    "MM     MMMMMM{  .W     MMMMMM     F          MMMM       JMMMMMMMMMMMMMMMMMMMMM       dMMh.      ?MMMMMMMMMMMMMMMMMMMMMMMMMN.      MMMM\n"+
                    "MM     MMMMMM{   d     MMMMMM     N         MMMMM       JMMMMMMMMMMMMMMMMMMMMM       MMMMN,       UMMMMMM    TMMMMMMMMMMMM^       MMMM\n"+
                    "MM     MMMMMMNa, d     F.TMMM     MMMMNNMMMMMMMMM       JMMMMMMMMMMMMMMMMMMMMM       MMMMMMm.      /MMMMM      ?TMMMMMMMMM        MMMM\n"+
                    "MM     MMMMMMMMMMM     F    M     MMMMMMMMMMMMMMM       JMMMMMMMMMMMMMMMMMMMMM       MMMMMMMN,       TMMMMM                      MMMMM\n"+
                    "MM     MTHMMMMMMMM     F    M     MMMMMMMMMMMMMMM       JMMMMMMMMMMMMMMMMMMMMM       MMMMMMMMMm.      ,MMMMNM                  MMMMMMM\n"+
                    "MM        MMTMMMMM     MMa,.M     MMMMMMMMMMMMMMM       dMMMMMMMMMMMMMMMMMMMMM       MMMMMMMMMMN        MMMMMMM............. gMMMMMMMM\n"+
                    "MMMMNJ,        ?TM     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMN,.      d     MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMg,.  d   .JMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMNaJ.JMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"
				+"\r\n"
				+"Current app version = " + app_ver
				+"\r\n"
				+"Current java version = " + java_ver
				+"\r\n"
				+"Pod UID = " + app_index
				+"\r\n"
				+"Pod host = " + app_host;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(PksdemoappApplication.class, args);
	}
}
