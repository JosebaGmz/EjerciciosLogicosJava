class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                // Reemplazar espacios con guiones bajos
                result.append('_');
            } else if (c == '-') {
                // Marcar la siguiente letra para que sea mayúscula (kebab-case a camelCase)
                capitalizeNext = true;
            } else if (Character.isDigit(c)) {
                // Convertir leetspeak
                switch (c) {
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                    default:
                        // Omitir caracteres numéricos que no forman parte del leetspeak
                        continue;
                }
            } else if (Character.isLetter(c)) {
                // Convertir a mayúscula si capitalizeNext está activado
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
            // Omitir cualquier carácter que no sea una letra o espacio
        }
        
        return result.toString();
    }
}
