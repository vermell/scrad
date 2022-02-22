import { ApolloServer } from "apollo-server";
import { ApolloGateway } from "@apollo/gateway";

const gateway = new ApolloGateway({
  serviceList: [
    {
      name: "books",
      url: "http://0.0.0.0:8000/graphql",
    }
  ],
  experimental_pollInterval: 2000,
});

const server = new ApolloServer({
  gateway
});

server
  .listen({ port: 7000 })
  .then(({ url }) => {
    console.info(`🚀 Gateway available at ${url}`);
  })
  .catch((err) => console.error("❌ Unable to start gateway", err));