package algoritmos;

public enum Provincia {
	//el orden+1 determina el numero que lo identifica en la cedula
	//el codigo (letra) se utiliza para las placas de vehiculos
	AZUAY('A'), 
	BOLIVAR('B'), 
	CAÑAR('U'),
	CARCHI('C'), 
	COTOPAXI('X'),
	CHIMBORAZO('H'),
	EL_ORO('O'),
	ESMERALDAS('E'), 
	GUAYAS('G'), 
	IMBABURA('I'), 
	LOJA('L'),
	LOS_RIOS('R'),
	MANABI('M'),	
	MORONA_SANTIAGO('V'),
	NAPO('N'),
	PASTAZA('S'),
	PICHINCHA('P'),
	TUNGURAHUA('T'),
	ZAMORA_CHINCHIPE('Z'),
	GALAPAGOS('W'),
	SUCUMBIOS('K'),    
	ORELLANA('Q'),
	SANTO_DOMINGO_DE_LOS_TSACHILAS('J'),
	SANTA_ELENA('Y');

	private char codigo;
	
	Provincia(char cod) {
		codigo = cod;
	}
	
	public char getCodigo() {
		return codigo;
	}
	
	public int getOrden() {
		return this.ordinal(); //retorna el orden desde 0
	}
	
	public static Provincia getProvincia(char codigo) {
		Provincia resul=null;
		for(Provincia p : Provincia.values()) {
			if(p.getCodigo()==codigo)
				resul = p;
		}
		return resul;
	}
}
