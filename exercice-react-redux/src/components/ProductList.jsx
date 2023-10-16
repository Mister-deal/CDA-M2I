import { useSelector } from "react-redux";
import ProductItem from "./ProductItem";

const ProductList = () => {
  const products = useSelector((state) => state.product.products);
  console.log(products);
  
  return (
    <>
      {products.map((product, key) => (
        <ProductItem product={product} key={key} />
      ))}
    </>
  );
};

export default ProductList;
