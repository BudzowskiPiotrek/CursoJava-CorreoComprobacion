package proyecto;

import java.util.Scanner;

public class Correo {

	public static void main(String[] args) {

		final String ERROR_ARROBA = "\033[31mEl Correo debe teneruna @ y no puede estar en principio o al final\033[37m";
		final String ERROR_CARACTER_USUARIO = "\033[31mHas introducido caracter innesesario\033[37m";
		final String ERROR_NULL_FINAL = "\033[31mNo has escrito la extencion, o no conlleva solo caracteres\033[37m";

		Scanner st = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("\033[32mEscribe un correo: \033[37m");
			String correo = st.next();

			int posicion = correo.indexOf('@');
			int posicion2 = correo.lastIndexOf('@');
			int posicion3 = correo.lastIndexOf('.');
			String extencion, dominio, usuario;
			char letra;

			if (posicion == posicion2) {
				if (posicion <= 0 || posicion == correo.length() - 1) {
					System.out.println(ERROR_ARROBA);
				} else {
					try {
						usuario = correo.substring(0, posicion);
						dominio = correo.substring(posicion + 1, posicion3);
						extencion = correo.substring(posicion3 + 1);

						try {
							for (int i = 0; i < usuario.length() ; i++) {
								letra = usuario.charAt(i);
								if (!((letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122
										|| letra >= 48 && letra <= 57 || letra == 95|| letra==46))) {

									throw new IllegalArgumentException(ERROR_CARACTER_USUARIO);

								} else {
									for (int j = 0; j < dominio.length(); j++) {
										letra = dominio.charAt(j);
										if (!((letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122
												|| letra >= 48 && letra <= 57))) {

											throw new IllegalArgumentException(ERROR_CARACTER_USUARIO);

										} else {

											for (int l = 0; l < extencion.length(); l++) {
												letra = extencion.charAt(l);
												if (!(letra >= 65 && letra <= 90 || letra >= 97 && letra <= 122)) {

													throw new StringIndexOutOfBoundsException(ERROR_NULL_FINAL);

												}

											}

										}
									}
								}

							}
							if ((usuario.length() > 2 && usuario.length() < 21)
									&& (dominio.length() > 2 && dominio.length() < 21)
									&& (extencion.length() > 1 && extencion.length() < 6)) {
								System.out.println("\033[35mCorreo es correcto\033[37m");
								flag = false;
								System.out.println(correo);
							} else {
								System.err.println("\033[31mNo tiene longitud no cumple parametros\033[37m");
								System.err.println("\033[31mUsuario   (min=3 max 20)\033[37m");
								System.err.println("\033[31mDominio   (min=3 max 20)\033[37m");
								System.err.println("\033[31mextencion (min=2 max 5)\033[37m");
							}

						} catch (IllegalArgumentException e) {
							System.err.println("El correo no es correcto!");
						}
					} catch (StringIndexOutOfBoundsException e) {
						System.err.println(ERROR_NULL_FINAL);
					}

				}

			} else {
				System.err.println(ERROR_ARROBA);
			}

		} while (flag);

	}

}
