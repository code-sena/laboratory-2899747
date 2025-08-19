# Backend - Laboratory Project

Este repositorio contiene el backend del proyecto **Laboratory**, desarrollado con **Spring Boot**.  
El proyecto está organizado bajo una estructura de carpetas siguiendo buenas prácticas para garantizar la mantenibilidad y escalabilidad.

---

## 📂 Estructura de carpetas
- `src/main/java` → Código fuente principal del backend.
- `src/main/resources` → Archivos de configuración (application.properties, application.yml, etc.).
- `src/test/java` → Pruebas unitarias y de integración.

---

## ⚙️ Tecnologías
- **Java 17**
- **Spring Boot** (con dependencias configuradas desde Spring Initializr)
- **Spring Data JPA** (para persistencia en base de datos)
- **Lombok** (para simplificar el código evitando boilerplate como getters, setters, constructores, etc.)
- **Maven** (para la gestión de dependencias y construcción del proyecto)

---

## ✨ Convenciones de código
- Se utiliza **camelCase** para nombrar variables y métodos.  
  Ejemplo: `userName`, `getEmployeeData()`.  
- Clases se nombran en **PascalCase**.  
  Ejemplo: `UserService`, `EmployeeController`.

---

## 🔧 Requisitos previos
- Tener instalado **Java 17** o superior.
- Tener instalado **Maven**.
- Configuración de base de datos (definida en `application.properties`).

## Database Naming Conventions

To keep consistency across the project, all database objects must follow these rules:

- **Language**: All names must be written in **English**.  
- **Nomenclature**: Use **PascalCase** for tables, columns, and relationships.  
- **Attributes**: Always use **singular** names (e.g., `User`, `Product`, `Order`).  
- **Tables**: Should represent entities (e.g., `User`, `Payment`, `Shipment`).  
- **Primary Keys**: Use the format `Id` (e.g., `UserId`, `ProductId`).  
- **Foreign Keys**: Reference the related entity in PascalCase (e.g., `UserId`, `OrderId`).  

### Example

```sql
CREATE TABLE User (
    UserId INT PRIMARY KEY,
    FirstName VARCHAR(100),
    LastName VARCHAR(100),
    Email VARCHAR(255)
);