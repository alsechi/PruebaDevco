#language:es
Característica: Como usuario deseo interactuar con la pagina de de block de notas

  Escenario: Crear una nota de texto enriquecido con letra en negrita
    Dado : el usuario esta en el bloc de notas
    Cuando el usuario quiere llenar la tabla de texto enriquecido con el texto
      | texto   |
      | <texto> |
    Entonces debe guardar su nota


    Ejemplos:
      | texto                           |
      | "texto una para la prueba de textos" |
      | "texto 2 para la prueba de textos" |

