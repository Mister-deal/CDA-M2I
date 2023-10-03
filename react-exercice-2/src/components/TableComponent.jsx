import { Person } from "./classe/Person"
const TableComponent = () => {
    const person1 = new Person("Didier", "beauregard")

    return(
        <>
            <td>
                {person1.map((firstname, i) => <span key={i}>{firstname}</span>)}
            </td>
            <td>
                {person1.map((lastname, i) => <span key={i}>{lastname}</span>)}
            </td>
            </>
    )
}
export default TableComponent