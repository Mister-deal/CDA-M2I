# image de départ
FROM nginx

# information utile
LABEL version="0.1"

MAINTAINER toto

WORKDIR /usr/share/nginx/html/

COPY . .

EXPOSE 80

CMD ["nginx","-g","daemon off;"]

# Pour construire l'image (avec option no cache)
# docker build --no-cache -t exo1 .

# Pour teste mon image
# docker run --name exo1test -p 5555:80 -d exo1