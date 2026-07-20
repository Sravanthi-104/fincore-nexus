import "./QuickActions.css";
import {
  FaUserPlus,
  FaExchangeAlt,
  FaFileInvoiceDollar,
  FaSearch
} from "react-icons/fa";

function QuickActions() {
  return (
    <div className="quick-actions">

      <div className="action-card">
        <FaUserPlus />
        <h3>Add Customer</h3>
      </div>

      <div className="action-card">
        <FaExchangeAlt />
        <h3>Transfer Money</h3>
      </div>

      <div className="action-card">
        <FaFileInvoiceDollar />
        <h3>Create Loan</h3>
      </div>

      <div className="action-card">
        <FaSearch />
        <h3>Search Account</h3>
      </div>

    </div>
  );
}

export default QuickActions;