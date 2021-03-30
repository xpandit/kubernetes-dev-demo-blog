FROM mongo:3.6.17

# Expose port
EXPOSE 27017

# Env variable to define database
ENV MONGO_INITDB_DATABASE=demodb

# Copy init script to docker init folder
COPY mongo-init.js /docker-entrypoint-initdb.d/

# Execute mongo
CMD ["mongod"]
