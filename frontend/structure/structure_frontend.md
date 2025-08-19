# Estructura de Proyecto Frontend

Esta es una estructura recomendada para un proyecto frontend
mediano/grande utilizando HTML, CSS y JavaScript puros. La idea es
mantener el código organizado, separando los archivos por páginas y
reutilizando componentes comunes.

/proyecto-frontend\
│\
├── index.html \# Página principal\
├── about.html \# Ejemplo: otra página\
├── contact.html \# Otra página\
│\
├── /assets \# Recursos compartidos\
│ ├── /img #Imagenes\
│ ├── /fonts \# Tipos de fuentes\
│ └── /icons \# Iconos\
│\
├── /common \# Cosas globales/reutilizables\
│ ├── css\
│ │ ├── reset.css\
│ │ ├── variables.css \# Variables de colores, tipografías, etc.\
│ │ └── global.css \# Estilos comunes (header, footer, botones\...)\
│ ├── js\
│ │ ├── utils.js \# Funciones utilitarias\
│ │ └── api.js \# Conexiones con APIs, si aplica\
│ └── components \# Bloques reutilizables (header, footer, cards\...)\
│ ├── header.html\
│ └── footer.html\
│\
├── /pages \# Cada página tiene su propio JS y CSS\
│ ├── home\
│ │ ├── home.html \# (si no es index, igual se puede tener)\
│ │ ├── home.css\
│ │ └── home.js\
│ ├── about\
│ │ ├── about.css\
│ │ └── about.js\
│ └── contact\
│ ├── contact.css\
│ └── contact.js\
│\
└── /libraries \# Librerías externas (ej: Bootstrap, jQuery, etc.)