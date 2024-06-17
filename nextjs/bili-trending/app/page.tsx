import { fetchData } from '../lib/api';

export default async function Home() {
  const data = await fetchData();
  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
      <ul className="divide-y divide-gray-200">
        {
          data.map((item: any) => 
            <li key={item.position} className="p-3 flex justify-between items-center user-card">
              <span className="ml-3 font-medium">{item.position}-{item.show_name}</span>
            </li>)
        }
      </ul>
    </main>
  );
}
