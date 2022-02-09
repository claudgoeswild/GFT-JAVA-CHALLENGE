class Exe3 {
static int strScore(String str[], String s, int n)
{
    int valor = 0, indice=0;
    for (int i = 0; i < n; i++) {
        if (str[i] == s) {
            for (int j = 0; j < s.length(); j++)
                valor += s.charAt(j) - 'a' + 1;
            indice = i + 1;
            break;
        }
    }
 
    valor = valor * indice;
    return valor;
}
    public static void main (String[] args) {
        String str[] = {"meu codigo nao precisa de comentarios"};
        String str1[] = {"eu conserto depois"};
        String str2[] = {"e so uma pequena mudança"};
        String str3[] = {"abba"};

        String string = "meu codigo nao precisa de comentarios";
        int n = str.length;
        int valor = strScore(str, string, n);
        System.out.println( valor);

        String string1 = "eu conserto depois";
        int n1 = str1.length;
        int valor1 = strScore(str1, string1, n1);
        System.out.println(valor1);

        String string2 = "e so uma pequena mudança";
        int n2 = str2.length;
        int valor2 = strScore(str2, string2, n2);
        System.out.println(valor2);
        
        String string3 = "abba";
        int n3 = str3.length;
        int valor3 = strScore(str3, string3, n3);
        System.out.println(valor3);
    }
}
