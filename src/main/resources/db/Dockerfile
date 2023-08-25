# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Set environment variables for PostgreSQL configuration
ENV POSTGRES_DB sweetvillas
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_INITDB_ARGS "--data-checksums"

# Expose the PostgreSQL port
EXPOSE 5432