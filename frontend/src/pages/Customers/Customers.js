import { useEffect, useState } from "react";
import { getAllCustomers } from "../../services/customerService";

function Customers() {
    const [customers, setCustomers] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        loadCustomers();
    }, []);

    async function loadCustomers() {
        try {
            const data = await getAllCustomers();
            setCustomers(data);
        } catch (error) {
            console.error(error);
        } finally {
            setLoading(false);
        }
    }

    return (
        <>
            {/* Pass customers to your CustomerTable component */}
        </>
    );
}

export default Customers;